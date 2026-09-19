SUMMARY = "perl Bindings for Git"
DESCRIPTION = "Git is a fast, scalable, distributed revision control system with an \
unusually rich command set that provides both high-level operations and \
full access to internals. \
 \
This package provides the Perl interface to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.55.0"

RPM_NAME = "perl-Git-2.55.0-3.2.aarch64.rpm"
RPM_HASH = "fe7a100de5a6378d5dd8ecdf6d878812a196cf3b32ef0030960515990a43822cab1a36f908694de9302e515985145aa38d145578fdbf3f3d129c2dc4677707a7"

RPROVIDES:${PN} += "git-core-/usr/lib/perl5/vendor-perl/5.44.0/Git \
perl-Git \
perl-Git--Error--Command \
perl-Git--I18N \
perl-Git--IndexInfo \
perl-Git--LoadCPAN \
perl-Git--LoadCPAN--Error \
perl-Git--LoadCPAN--Mail--Address \
perl-Git--Packet \
perl-Git--SVN \
perl-Git--SVN--Editor \
perl-Git--SVN--Fetcher \
perl-Git--SVN--GlobSpec \
perl-Git--SVN--Log \
perl-Git--SVN--Memoize--YAML \
perl-Git--SVN--Migration \
perl-Git--SVN--Prompt \
perl-Git--SVN--Ra \
perl-Git--SVN--Utils \
perl-Git--activestate-pipe"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Error"

inherit rpm
