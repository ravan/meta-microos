SUMMARY = "Fish Completion for asdf"
DESCRIPTION = "Fish command line completion support for asdf."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "asdf-fish-completion-0.20.0-1.2.noarch.rpm"
RPM_HASH = "395b9e1cd810fa7f81e3217ded837c386fdfab7a5f87d552281c183431e35484f3d9c04140059dc40544265c4427dec7b6c79556a25a8cf4fa35969a43198a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asdf-fish-completion"

RDEPENDS:${PN} += "asdf"

inherit rpm
