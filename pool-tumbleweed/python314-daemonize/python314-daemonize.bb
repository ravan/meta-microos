SUMMARY = "Python module to launch code as a daemon process"
DESCRIPTION = "daemonize is a library for writing system daemons in Python."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python314-daemonize-2.5.0-5.10.noarch.rpm"
RPM_HASH = "b7491b05e0cc42b3dd089882145ce3b3df27df2813d4fa7084c4127a7dd04e7ba4bcabb9b7d79fce1ba27584b796a52bc529a483db22226f160d479ea489ace0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-daemonize \
python314-daemonize \
python3dist-daemonize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
