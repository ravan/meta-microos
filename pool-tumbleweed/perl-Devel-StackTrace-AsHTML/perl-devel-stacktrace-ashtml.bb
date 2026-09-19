SUMMARY = "Displays stack trace in HTML"
DESCRIPTION = "Devel::StackTrace::AsHTML adds 'as_html' method to Devel::StackTrace which \
displays the stack trace in beautiful HTML, with code snippet context and \
function parameters. If you call it on an instance of \
Devel::StackTrace::WithLexicals, you even get to see the lexical variables \
of each stack frame."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.150.0"

RPM_NAME = "perl-Devel-StackTrace-AsHTML-0.150.0-1.3.noarch.rpm"
RPM_HASH = "af8bb3f1f9c0ec69f473e445ed783bf04dd9b71118e9dfcd21470c27af5fbe01c244f3f7360ba15a67ed65f6ae5d567a41459edbd232b2e322a46a5109bcacd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--StackTrace--AsHTML \
perl-Devel-StackTrace-AsHTML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--StackTrace"

inherit rpm
