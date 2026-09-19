SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.2"

RPM_NAME = "python313-pyte-0.8.2-2.5.noarch.rpm"
RPM_HASH = "f002b99b6f0a641849da9ba83d807af7d345d9a7eec6c1e7f64a7bbfd0eaedbad8df05d3096a0b52f6084ad201b21f7b7ab832720e5e0caebdc97eea7a0554f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyte \
python3.13dist-pyte \
python313-pyte \
python3dist-pyte"

RDEPENDS:${PN} += "python-abi \
python313-wcwidth"

inherit rpm
