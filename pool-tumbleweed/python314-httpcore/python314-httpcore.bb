SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python314-httpcore-1.0.9-1.6.noarch.rpm"
RPM_HASH = "15cc0995971b1d979b43273d73c7ed809ef5158a2c64966da1435235ca1a523605472355e5636ed49415c50fa7863b34e44263f5853856bae590283bebc6fa63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpcore \
python314-httpcore \
python3dist-httpcore"

RDEPENDS:${PN} += "-python314-anyio >= 3 with python314-anyio < 5 \
-python314-sniffio >= 1.0 with python314-sniffio < 2 \
python-abi \
python314-certifi \
python314-h11"

inherit rpm
