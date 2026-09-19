SUMMARY = "an extension of Params::Validate using Moose's types"
DESCRIPTION = "This module fills a gap in Moose by adding method parameter validation to \
Moose. This is just one of many developing options, it should not be \
considered the 'official' one by any means though. \
 \
You might also want to explore 'MooseX::Method::Signatures' and \
'MooseX::Declare'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-MooseX-Params-Validate-0.21-1.41.noarch.rpm"
RPM_HASH = "6014c2db0526087a2986e15d944a2ccbc1259177aacf9772469fe33c3b9b6c4d3e2f8bf2cb83f263899e483b3d023d02085904da8429a04b2f915c6daa6674a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Params--Validate \
perl-MooseX--Params--Validate--Exception--ValidationFailedForTypeConstraint \
perl-MooseX-Params-Validate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--Caller \
perl-Moose \
perl-Moose--Exception \
perl-Moose--Util \
perl-Moose--Util--TypeConstraints \
perl-Params--Validate \
perl-Sub--Exporter"

inherit rpm
