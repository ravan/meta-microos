SUMMARY = "Human-friendly HSL"
DESCRIPTION = "Human-friendly HSL"
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "python314-hsluv-5.0.4-1.12.noarch.rpm"
RPM_HASH = "2de03d51f646295c366e4ce7d64a40baec17df18d4f1cf8bce6740f85c1e31a506392ef00204230e9dc09766fcb0738044eda7e3980e05c94d096f09738cfe1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hsluv \
python314-hsluv \
python3dist-hsluv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
