SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "python314-tomlkit-0.15.1-2.1.noarch.rpm"
RPM_HASH = "7e450a2dd4764d540012831dd007961fac21649bfc044784541d265152aca54972e7e217390a3f00d13098ab5879aaba9a920fea13097cd3fccac8d55e530820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tomlkit \
python314-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
