SUMMARY = "generate new packages quickly and easily"
DESCRIPTION = "This module lets you quickly and easily construct new packages. It gives \
them unused names and sets up their package data, if provided."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.106"

RPM_NAME = "perl-Package-Generator-1.106-3.42.noarch.rpm"
RPM_HASH = "8688c20379657b82565d44bb7a393285617215c1008fc7c58c752d5618f0d27b52750df988ae1e46b5bd2cd35ac27398ce38886bc41bd76891a0db34c21baf18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Package--Generator \
perl-Package--Reaper \
perl-Package-Generator"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
