SUMMARY = "Validate method/function parameters"
DESCRIPTION = "*I would recommend you consider using Params::ValidationCompiler instead. \
That module, despite being pure Perl, is _significantly_ faster than this \
one, at the cost of having to adopt a type system such as Specio, \
Type::Tiny, or the one shipped with Moose*. \
 \
This module allows you to validate method or function call parameters to an \
arbitrary level of specificity. At the simplest level, it is capable of \
validating the required parameters were given and that no unspecified \
additional parameters were passed in. \
 \
It is also capable of determining that a parameter is of a specific type, \
that it is an object of a certain class hierarchy, that it possesses \
certain methods, or applying validation callbacks to arguments."
LICENSE = "Artistic-2.0"

PV = "1.310.0"

RPM_NAME = "perl-Params-Validate-1.310.0-1.8.aarch64.rpm"
RPM_HASH = "426a2ac90da7b972122f103ba176a54049f4e7d7aca05721db90173a4d77c601df9d0a790766581fc6a7742b3ab644350f455d4ed7509c7a1ed4959793d7d8fc"

RPROVIDES:${PN} += "perl-Params--Validate \
perl-Params--Validate--Constants \
perl-Params--Validate--PP \
perl-Params--Validate--XS \
perl-Params-Validate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Module--Implementation"

inherit rpm
