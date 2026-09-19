SUMMARY = "Role callbacks"
DESCRIPTION = "This module allows a role to run a callback when it is applied to a class \
or to another role."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.8.0"

RPM_NAME = "perl-Role-Hooks-0.8.0-1.8.noarch.rpm"
RPM_HASH = "cd488769405860ccf463e3183221474ce3b728aa2b16bfbd77d6d4b721a4f7a4a249a1dce06d551cfe12777144070590584a6233a7944c5e8157a4ec1a1d530a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Role--Hooks \
perl-Role-Hooks"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Method--Modifiers \
perl-List--Util"

inherit rpm
