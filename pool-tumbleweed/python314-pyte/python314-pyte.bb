SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.2"

RPM_NAME = "python314-pyte-0.8.2-2.5.noarch.rpm"
RPM_HASH = "f60b6c83ac4e645dec934120deb8fb8b72bad5d97e3264074db9d138536891026e683b393c6d46b7ac3955a4acc9df6e6afd75f0bb00ac4be805874007ef019d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyte \
python314-pyte \
python3dist-pyte"

RDEPENDS:${PN} += "python-abi \
python314-wcwidth"

inherit rpm
