SUMMARY = "Build an optimized subroutine parameter validator once, use it forever"
DESCRIPTION = "This module creates a customized, highly efficient parameter checking \
subroutine. It can handle named or positional parameters, and can return \
the parameters as key/value pairs or a list of values. \
 \
In addition to type checks, it also supports parameter defaults, optional \
parameters, and extra 'slurpy' parameters."
LICENSE = "Artistic-2.0"

PV = "0.310.0"

RPM_NAME = "perl-Params-ValidationCompiler-0.310.0-1.5.noarch.rpm"
RPM_HASH = "fd575dddb38b1d6f46383b1a55e1e529bcf0b12b68f4a53fbe9a5ebcfc826e864a14e17e78f02707dc93447e9a82e07df886fc70d5e189c6dae0a6c6f8a056fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Params--ValidationCompiler \
perl-Params--ValidationCompiler--Compiler \
perl-Params--ValidationCompiler--Exceptions \
perl-Params-ValidationCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Eval--Closure \
perl-Exception--Class \
perl-List--Util"

inherit rpm
