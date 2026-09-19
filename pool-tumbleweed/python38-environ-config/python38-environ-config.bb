SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python38-environ-config-22.1.0-1.1.noarch.rpm"
RPM_HASH = "f19d3e9fc37f9893601a495061f97a63933564a871f457af1856a3f84789c3033a6faac91680eadddedef6b5a0f69ffef01b011a0d4f37b9122500da116ba7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-environ-config \
python38-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python38-attrs"

inherit rpm
