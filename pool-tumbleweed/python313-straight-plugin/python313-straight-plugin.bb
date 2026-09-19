SUMMARY = "Python plugin loader"
DESCRIPTION = "straight.plugin is a Python plugin loader inspired by twisted.plugin with two \
important distinctions: \
 \
 - Fewer dependencies \
 - Python 3 compatible \
 \
The system is used to allow multiple Python packages to provide plugins within \
a namespace package, where other packages will locate and utilize. The plugins \
themselves are modules in a namespace package where the namespace identifies \
the plugins in it for some particular purpose or intent."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-straight-plugin-1.5.0-3.5.noarch.rpm"
RPM_HASH = "01abeab41cb4a3ea4205217b7afae25d1f2336a86ab4906f2f739bc1abdae7fe93d7c55e3c1ad7d879db6991162c50b846b60f780069051f28319d05bc929a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-straight-plugin \
python3.13dist-straight.plugin \
python313-straight-plugin \
python3dist-straight.plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
