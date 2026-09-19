SUMMARY = "A collection of tweening / easing functions"
DESCRIPTION = "A collection of tweening / easing functions implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python313-PyTweening-1.2.0-2.5.noarch.rpm"
RPM_HASH = "7f9deba97aa7747c72912f5783a3d4d410956ac5628f0e9afaab513c29b9ba955b829190757197a881c411c902048f93ac195a29fb94d6b8e03f8d96a2f4c302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyTweening \
python3.13dist-pytweening \
python313-PyTweening \
python3dist-pytweening"

RDEPENDS:${PN} += "python-abi"

inherit rpm
