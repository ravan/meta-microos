SUMMARY = "Allows your classes to do coercion of parameters"
DESCRIPTION = "A big part of good API design is that we should be able to be flexible in \
the ways that we take parameters. \
 \
Params::Coerce attempts to encourage this, by making it easier to take a \
variety of different arguments, while adding negligible additional \
complexity to your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Params-Coerce-0.15-1.26.noarch.rpm"
RPM_HASH = "cc8d431b45ff621ee57c81133d0578bd00a2fcbefe7340a32e60337408cbc47ba52ed0714eb3b5ff1517373b92c126d64a7e9d77f162182c1b543260b5e6939f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Params--Coerce \
perl-Params-Coerce"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Params--Util"

inherit rpm
