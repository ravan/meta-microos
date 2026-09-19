SUMMARY = "Recursive copying of files and directories within Perl 5 toolchain"
DESCRIPTION = "This library is intended as a not-quite-drop-in replacement for certain \
functionality provided by CPAN distribution \
File-Copy-Recursive|http://search.cpan.org/dist/File-Copy-Recursive/. The \
library provides methods similar enough to that distribution's 'fcopy()', \
'dircopy()' and 'rcopy()' functions to be usable in those CPAN \
distributions often described as being part of the Perl toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.8.0"

RPM_NAME = "perl-File-Copy-Recursive-Reduced-0.8.0-1.12.noarch.rpm"
RPM_HASH = "9add6369a00f846a0952479fe4da84cb1972237a9406d43699bf23ae6ae52f62060fb93c088691a8bbc2f3fe9c0967b5ce3f24c3b8e17a51489e84f522b91bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Copy--Recursive--Reduced \
perl-File-Copy-Recursive-Reduced"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
