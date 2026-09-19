SUMMARY = "Package to replace curses and create ASCII animations"
DESCRIPTION = "Asciimatics is a package to help people create full-screen text UIs \
(from interactive forms to ASCII animations) on any platform."
LICENSE = "Apache-2.0"

PV = "1.15.0"

RPM_NAME = "python314-asciimatics-1.15.0-2.10.noarch.rpm"
RPM_HASH = "3bdeeb843aa2e69b2f9c4f14065d30d8df216f9cff5774c65622c9371fe517a80c52e3cc0695bc96c9969199bcecbf9c2843e38ebafda8454f22473693bb08ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asciimatics \
python314-asciimatics \
python3dist-asciimatics"

RDEPENDS:${PN} += "python-abi \
python314-Pillow \
python314-curses \
python314-pyfiglet \
python314-wcwidth"

inherit rpm
