SUMMARY = "Display text in formatted table output"
DESCRIPTION = "Text::TabularDisplay simplifies displaying textual data in a table. The \
output is identical to the columnar display of query results in the mysql \
text monitor. For example, this data: \
 \
    1, 'Tom Jones', '(666) 555-1212' \
    2, 'Barnaby Jones', '(666) 555-1213' \
    3, 'Bridget Jones', '(666) 555-1214' \
 \
Used like so: \
 \
    my $t = Text::TabularDisplay->new(qw(id name phone)); \
    $t->add(1, 'Tom Jones', '(666) 555-1212'); \
    $t->add(2, 'Barnaby Jones', '(666) 555-1213'); \
    $t->add(3, 'Bridget Jones', '(666) 555-1214'); \
    print $t->render; \
 \
Produces: \
 \
    +----+---------------+----------------+ \
    | id | name          | phone          | \
    +----+---------------+----------------+ \
    | 1  | Tom Jones     | (666) 555-1212 | \
    | 2  | Barnaby Jones | (666) 555-1213 | \
    | 3  | Bridget Jones | (666) 555-1214 | \
    +----+---------------+----------------+"
LICENSE = "GPL-2.0"

PV = "1.38"

RPM_NAME = "perl-Text-TabularDisplay-1.38-3.42.noarch.rpm"
RPM_HASH = "ae2bad5e452eb821a2f22c8fa734b2770496cb9ce58e710038e18d9a62164f19e9d54c2bd54472ba48184f964f5b644f8840dffd296afe29a2ac432dd3586b58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--TabularDisplay \
perl-Text-TabularDisplay"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
