SUMMARY = "Series of charting modules"
DESCRIPTION = "Chart helps you to create PNG and JPG images with visualizations of numeric \
data. This page gives you a summary how to use it. For a more thorough \
documentation and lots of example code please visit the Chart::Manual."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.403.9"

RPM_NAME = "perl-Chart-2.403.9-2.3.noarch.rpm"
RPM_HASH = "c8648f166bada6658f8721977b2614261a269146bcdd2490913b996295db0a0605e84e57a5583a613e8320914e6e54717d96631dde207f4eb601ad47ba168645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Chart \
perl-Chart--Bars \
perl-Chart--Base \
perl-Chart--BrushStyles \
perl-Chart--Composite \
perl-Chart--Constants \
perl-Chart--Direction \
perl-Chart--ErrorBars \
perl-Chart--HorizontalBars \
perl-Chart--Lines \
perl-Chart--LinesPoints \
perl-Chart--Mountain \
perl-Chart--Pareto \
perl-Chart--Pie \
perl-Chart--Points \
perl-Chart--Property \
perl-Chart--Property--DataType--Color \
perl-Chart--Property--DataType--Font \
perl-Chart--Split \
perl-Chart--StackedBars"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Carp \
perl-GD \
perl-Graphics--Toolkit--Color"

inherit rpm
