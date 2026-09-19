SUMMARY = "A thin, practical wrapper around terminal capabilities in Python"
DESCRIPTION = "Curses-like terminal wrapper with a display based on compositing 2d \
arrays of text."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python313-blessings-1.7-4.5.noarch.rpm"
RPM_HASH = "40c99087f4ccfd2e92097e86fecd00faf28e0a0c53b526a63aaf535df808e79b29f5439c469c17bcc470218e9a658c6b256cb30c4fa1a2925022ee09d2870d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blessings \
python3.13dist-blessings \
python313-blessings \
python3dist-blessings"

RDEPENDS:${PN} += "python-abi \
python313-curses \
python313-six"

inherit rpm
