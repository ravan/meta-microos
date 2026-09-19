SUMMARY = "Perl extensions for the rxvt-unicode terminal emulator"
DESCRIPTION = "A small collection of perl extensions for the urxvt-unicode terminal emulator. \
keyboard-select: Use keyboard shortcuts to select and copy text. \
url-select: Use keyboard shortcuts to select URLs. \
clipboard: Use keyboard shortcuts to copy the selection to the clipboard and \
to paste the clipboard contents (optionally escaping all special characters)."
LICENSE = "GPL-2.0"

PV = "2.3"

RPM_NAME = "urxvt-perls-2.3-1.12.aarch64.rpm"
RPM_HASH = "a26f5335d06126d33fc384548f7545080a4e3a61e69b24df5ab5b87cbbded796472106c94a6472b0ad434cceb0c8564809087c623f556271ee4b810b40f7e90a"

RPROVIDES:${PN} += "urxvt-perls"

RDEPENDS:${PN} += "xsel"

inherit rpm
