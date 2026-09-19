SUMMARY = "Alias lexical variables"
DESCRIPTION = "Devel::LexAlias provides the ability to alias a lexical variable in a \
subroutines scope to one of your choosing. \
 \
If you don't know why you'd want to do this, I'd suggest that you skip this \
module. If you think you have a use for it, I'd insist on it. \
 \
Still here? \
 \
* lexalias( $where, $name, $variable ) \
 \
'$where' refers to the subroutine in which to alias the lexical, it can be \
a coderef or a call level such that you'd give to 'caller' \
 \
'$name' is the name of the lexical within that subroutine \
 \
'$variable' is a reference to the variable to install at that location"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.50.0"

RPM_NAME = "perl-Devel-LexAlias-0.50.0-1.8.aarch64.rpm"
RPM_HASH = "e8bc4cca80e191d2120b1a07341ebfe805fd94dc0510f7362bdf8d77eddf97da3a0d621be277ab11b90d3bb22569696784357fceea4a9372f4757c8d5a101219"

RPROVIDES:${PN} += "perl-Devel--LexAlias \
perl-Devel-LexAlias"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Devel--Caller"

inherit rpm
