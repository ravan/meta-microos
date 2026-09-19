SUMMARY = "Simple Viewer for NFO Files"
DESCRIPTION = "NFO Viewer is a simple viewer for NFO files, which are 'ASCII' art in \
the CP437 codepage. The advantages of using NFO Viewer instead of a text \
editor are preset font and encoding settings, automatic window size and \
clickable hyperlinks."
LICENSE = "GPL-3.0-or-later"

PV = "1.99"

RPM_NAME = "nfoview-1.99-1.11.noarch.rpm"
RPM_HASH = "2ec512a9a7fbca1fb4af8de4385d2984c5500608a0cdc7dbbaef65fed9d4622085efeefcbe46846a7487b0346a6dbb7e80f0b73b492944286fa85aa29c2b8a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nfoview \
python3.13dist-nfoview \
python3dist-nfoview"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
