SUMMARY = "Zsh shell manual in HTML format"
DESCRIPTION = "The zsh shell is a command interpreter usable as an interactive login \
shell and as a shell script command processor.  Zsh resembles the ksh \
shell (the Korn shell), but includes many enhancements.  Zsh supports \
command line editing, built-in spelling correction, programmable \
command completion, shell functions (with autoloading), a history \
mechanism, and more. \
 \
This package contains the Zsh manual in HTML format."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-htmldoc-5.9-12.7.aarch64.rpm"
RPM_HASH = "6acfa7cf33a8eead8f9ee4cbece669b3b457e0a77decdefd519718adbde234ae6dc8dc3a154000fb27f7467c2e8cfbcde4dd10a4cf7fc93118de35dfb2eabe95"

RPROVIDES:${PN} += "zsh-html \
zsh-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
