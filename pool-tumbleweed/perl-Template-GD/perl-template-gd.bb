SUMMARY = "Template::GD Perl module"
DESCRIPTION = "Template::GD Perl module"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.66"

RPM_NAME = "perl-Template-GD-2.66-1.37.noarch.rpm"
RPM_HASH = "b1ef98d4328695bc35d659dffe4dce5c7f865e460844055ca234f7c781562a578d3d29a221bbaa999d6e5a65a3fa5dea38815f6f5fda43176cc3bf592252faba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Template--Plugin--GD \
perl-Template--Plugin--GD--Constants \
perl-Template--Plugin--GD--Graph--area \
perl-Template--Plugin--GD--Graph--bars \
perl-Template--Plugin--GD--Graph--bars3d \
perl-Template--Plugin--GD--Graph--lines \
perl-Template--Plugin--GD--Graph--lines3d \
perl-Template--Plugin--GD--Graph--linespoints \
perl-Template--Plugin--GD--Graph--mixed \
perl-Template--Plugin--GD--Graph--pie \
perl-Template--Plugin--GD--Graph--pie3d \
perl-Template--Plugin--GD--Graph--points \
perl-Template--Plugin--GD--Image \
perl-Template--Plugin--GD--Polygon \
perl-Template--Plugin--GD--Text \
perl-Template--Plugin--GD--Text--Align \
perl-Template--Plugin--GD--Text--Wrap \
perl-Template-GD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-GD \
perl-Template"

inherit rpm
