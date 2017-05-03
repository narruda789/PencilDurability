package nicole.durability.mocks;

import nicole.durability.*;

public class MockPaper implements PaperInterface {

	private boolean showPaperWasCalled = false;
	private boolean replaceWithWhitespaceWasCalled = false;
	private String textPassedToWrite;
	private String textPassedToReplaceWithWhitespace;

	@Override
	public void showPaper() {
		this.showPaperWasCalled = true;
	}

	@Override
	public void write(String textToWriteToPaper) {
		this.textPassedToWrite = textToWriteToPaper;
	}

	@Override
	public void replaceWithWhitespace(String textToErase) {
		this.textPassedToReplaceWithWhitespace = textToErase;
		this.replaceWithWhitespaceWasCalled = true;
	}

	public String getTextPassedToWrite() {
		return this.textPassedToWrite;
	}

	public boolean replaceWithWhitespaceWasCalled() {
		return this.replaceWithWhitespaceWasCalled;
	}

	public boolean showPaperWasCalled() {
		return this.showPaperWasCalled;
	}

	public String getTextPassedToReplaceWithWhitespace() {
		return this.textPassedToReplaceWithWhitespace;
	}
}
