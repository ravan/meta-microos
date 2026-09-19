SUMMARY = "Add line numbers to heredoc blocks that contain perl source code"
DESCRIPTION = "Add a '#line 'this-file' 392' comment to heredoc/hereis text that is going \
to be eval'ed so that error messages will point back to the right place. \
 \
Please note: when you embed '\\n' in your code, it gets expanded in \
double-quote hereis documents so it will mess up your line numbering. Use \
'\\\\n' instead when you can."
LICENSE = "Artistic-2.0 | LGPL-2.1-only"

PV = "0.35"

RPM_NAME = "perl-Eval-LineNumbers-0.35-1.25.noarch.rpm"
RPM_HASH = "8912ea5d3aa03f01de910d37a3afcd577175aa37365563b7d2d9f2c12c6dc3628e900db19cab8a3de09930e70920600f36e6659f48b1752f15eef5f2490f6384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Eval--LineNumbers \
perl-Eval-LineNumbers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
