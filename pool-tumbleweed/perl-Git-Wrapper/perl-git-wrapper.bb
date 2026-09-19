SUMMARY = "Wrap git(7) command-line interface"
DESCRIPTION = "Git::Wrapper provides an API for git(7) that uses Perl data structures for \
argument passing, instead of CLI-style '--options' as Git does."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.48.0"

RPM_NAME = "perl-Git-Wrapper-0.48.0-1.3.noarch.rpm"
RPM_HASH = "92ba005a82cda46b7fe571452929146eaf3601a87e5c5df75c26f16c506573b748ed599dd83cd9657a45aee0306888a1df52766121ef32c93361421186e95d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Wrapper \
perl-Git--Wrapper--Exception \
perl-Git--Wrapper--File--RawModification \
perl-Git--Wrapper--Log \
perl-Git--Wrapper--Status \
perl-Git--Wrapper--Statuses \
perl-Git-Wrapper"

RDEPENDS:${PN} += "git-core \
perl--MODULE-COMPAT-5.44.0 \
perl-File--chdir \
perl-IPC--Cmd \
perl-Sort--Versions"

inherit rpm
