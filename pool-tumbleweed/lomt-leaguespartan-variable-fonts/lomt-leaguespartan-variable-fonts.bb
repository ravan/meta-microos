SUMMARY = "A contemporary serif typeface family for long-form reading (variable version)"
DESCRIPTION = "League Spartan is The League Of Moveable Type's interpretation of Matt Bailey's Spartan, a typeface based on early 20th century American geometric sans serifs. This package contains the variable version of fonts."
LICENSE = "OFL-1.1"

PV = "2.220"

RPM_NAME = "lomt-leaguespartan-variable-fonts-2.220-1.9.noarch.rpm"
RPM_HASH = "492257bd35be06b0d5b0e1746ce0ecf772513f2ae184c4cfe2c93c6673f44dbe2f9a4a6cef09077e90d2c769c50c3545049e38e3afb93d6add0e7346ac495f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-leaguespartan-variable-fonts"

RDEPENDS:${PN} += "aaa-base \
coreutils \
perl"

inherit rpm
