SUMMARY = "Brazilian_Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Brazilian_Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-l10n-pt_BR-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "a3a385419464f4abf3cbea9659199a0ef859f4ca8d88376d6ed7ab02edbda50d38ff231944089984660d654af36c06e53539f2cebd3638b83d67cafc9636cd4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt-BR \
libreoffice-l10n-pt-BR \
locale-libreoffice-pt-BR"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-BR"

inherit rpm
