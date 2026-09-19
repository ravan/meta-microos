SUMMARY = "Codecs for reading/writing documents in the ANSEL character set"
DESCRIPTION = "Codecs for reading/writing documents in the ANSEL character set."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-ansel-1.0.0-2.13.noarch.rpm"
RPM_HASH = "2e0e28721b043af9837b4fd262bc004df8964dea011b1852742fcc773388bba3246231a3e2c786916a6f1efc9a6a4f099999d1f7e781b901f2e04c2f513e8b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansel \
python3.13dist-ansel \
python313-ansel \
python3dist-ansel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
