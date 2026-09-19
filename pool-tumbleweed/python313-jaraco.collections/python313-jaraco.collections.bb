SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "python313-jaraco.collections-5.2.1-1.5.noarch.rpm"
RPM_HASH = "dfbd65fbd484589378427b7e19af5268e20e0f3bcb3f1fc757d6bab67152ac5ba3bdc1689ba937ffa0feb9c27caf61250d0e646e8db7f5c8e372c4c76d689eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.collections \
python3.13dist-jaraco.collections \
python313-jaraco.collections \
python3dist-jaraco.collections"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.text"

inherit rpm
