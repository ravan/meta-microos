SUMMARY = "Doing dirty (but useful) things with equals"
DESCRIPTION = "Doing dirty (but extremely useful) things with equals."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python313-dirty-equals-0.11.0-1.2.noarch.rpm"
RPM_HASH = "2a3c5b4873376944ae0382181df2ce970cf80e04e3c4e5c975d2666cb2a96d693ffdbd4f2c20085eac7b810b256a657b3337bddb36433bcd9fa21615c7de08a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dirty-equals \
python3.13dist-dirty-equals \
python313-dirty-equals \
python3dist-dirty-equals"

RDEPENDS:${PN} += "python-abi \
timezone"

inherit rpm
