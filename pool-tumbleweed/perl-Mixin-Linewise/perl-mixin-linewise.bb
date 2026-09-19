SUMMARY = "Write your linewise code for handles; this does the rest"
DESCRIPTION = "It's boring to deal with opening files for IO, converting strings to \
handle-like objects, and all that. With Mixin::Linewise::Readers and \
Mixin::Linewise::Writers, you can just write a method to handle handles, \
and methods for handling strings and filenames are added for you."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.111"

RPM_NAME = "perl-Mixin-Linewise-0.111-1.18.noarch.rpm"
RPM_HASH = "43244368b190ca09fd4c328de6efc78167369f840d21ebbcb97fe7ab78b43b1aa021b19e0755d0e9a7c8b93b7b47cf8ddca9252713e4820f5d2dbb082dce8888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mixin--Linewise \
perl-Mixin--Linewise--Readers \
perl-Mixin--Linewise--Writers \
perl-Mixin-Linewise"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-PerlIO--utf8-strict \
perl-Sub--Exporter"

inherit rpm
