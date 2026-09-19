SUMMARY = "Web and LAMP Server"
DESCRIPTION = "Software to set up a Web server that is able to serve static, dynamic, and interactive content (like a Web shop). This includes Apache HTTP Server, the database management system MySQL, and scripting languages such as PHP, Python, Ruby on Rails, or Perl."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-lamp_server-20250313-5.2.aarch64.rpm"
RPM_HASH = "64899b46eb6066a84b90ed7dbd747f33e67e0eac00f90c8e42f15b6e64c146c05a8f9de458f78d64f80189b45ca2659c74dd0cd86cd18cb2a85e6a34142e7da4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-lamp-server \
patterns-server-lamp-server"

RDEPENDS:${PN} += "apache2 \
pattern-"

inherit rpm
