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

RPM_NAME = "python314-straight-plugin-1.5.0-3.5.noarch.rpm"
RPM_HASH = "fd113e5cdd3598a7b4d2ac548321958fbace69e8238a8f497aed33f11e399e02384fa75c7331656ead31182ff74998e61fd7213fa45f02380927834474d1e06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-straight.plugin \
python314-straight-plugin \
python3dist-straight.plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
