SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2025.1.5"

RPM_NAME = "python313-pudb-2025.1.5-1.4.noarch.rpm"
RPM_HASH = "d95bd2fc9a6ab05a38a535d7688116c0fb50c1289b24b20341e67fa3709fa593d1d5f49718c64094d5da917edada5d6ed6f896155f562848d3178b2af4d0903f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pudb \
python3.13dist-pudb \
python313-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pygments \
python313-jedi \
python313-packaging \
python313-typing-extensions \
python313-urwid \
python313-urwid-readline \
update-alternatives"

inherit rpm
