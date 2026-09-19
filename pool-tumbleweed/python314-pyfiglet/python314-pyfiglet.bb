SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python314-pyfiglet-1.0.4-1.3.noarch.rpm"
RPM_HASH = "bbcfbec13aa49814cc03931fd34b6b31e2a5c50ab7e05064d3cd33c3f14fdf46fd79fcb5fd9eb1a89d3c393bb964d67e51b08a24b8bec2e7043074c70a95662c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyfiglet \
python314-pyfiglet \
python3dist-pyfiglet"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
