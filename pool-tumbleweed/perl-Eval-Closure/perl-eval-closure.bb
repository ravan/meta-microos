SUMMARY = "Safely and cleanly create closures via string eval"
DESCRIPTION = "String eval is often used for dynamic code generation. For instance, \
'Moose' uses it heavily, to generate inlined versions of accessors and \
constructors, which speeds code up at runtime by a significant amount. \
String eval is not without its issues however - it's difficult to control \
the scope it's used in (which determines which variables are in scope \
inside the eval), and it's easy to miss compilation errors, since eval \
catches them and sticks them in $@ instead. \
 \
This module attempts to solve these problems. It provides an 'eval_closure' \
function, which evals a string in a clean environment, other than a fixed \
list of specified variables. Compilation errors are rethrown automatically."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.140.0"

RPM_NAME = "perl-Eval-Closure-0.140.0-1.7.noarch.rpm"
RPM_HASH = "36d555ae9c6eac49eb856aa38e8bcfc3fcae98d8fd7c08ab18a5c7030ce3614d3b3321012513d8ad23d648cb1ae7b62c36d92f1309cd7ab21fb6cee6e6bcbab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Eval--Closure \
perl-Eval-Closure"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
