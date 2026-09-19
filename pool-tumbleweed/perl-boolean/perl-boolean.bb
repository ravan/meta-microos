SUMMARY = "Boolean support for Perl"
DESCRIPTION = "Most programming languages have a native 'Boolean' data type. Perl does \
not. \
 \
Perl has a simple and well known Truth System. The following scalar values \
are false: \
 \
    $false1 = undef; \
    $false2 = 0; \
    $false3 = 0.0; \
    $false4 = ''; \
    $false5 = '0'; \
 \
Every other scalar value is true. \
 \
This module provides basic Boolean support, by defining two special \
objects: 'true' and 'false'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.46"

RPM_NAME = "perl-boolean-0.46-1.39.noarch.rpm"
RPM_HASH = "c6d44d636f6c03b2bdad736745b3e0076bbc40e9a7b235990e65d8f0564b2d4ad2e2d476e71f52e6431a4343d7ac2063b114e1288fc1353152eb2f262a64ec33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-boolean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
