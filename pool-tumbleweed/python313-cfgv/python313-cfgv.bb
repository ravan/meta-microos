SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python313-cfgv-3.5.0-1.4.noarch.rpm"
RPM_HASH = "48e25d6a53a958a6330e42abc691b6dc99fb0b41d28f20774b0fa827721d2d8cb8bea8933b99918dceabb231b4f2fe4e85c4196a50e8d0f55c0e4b787916aeb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cfgv \
python3.13dist-cfgv \
python313-cfgv \
python3dist-cfgv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
