SUMMARY = "'render_file' helper for Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::RenderFile is a Mojolicious plugin that adds \
'render_file' helper. It does not read file in memory and just streaming it \
to a client."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-Mojolicious-Plugin-RenderFile-0.12-3.33.noarch.rpm"
RPM_HASH = "e9c5953e4b2e65cb49eee65b8ab6c49843dbe2faea99c7860f11338bb2c13aa27117596468af7088b3aa12422dfb6eb9563944337838af5fde795f9f093b065d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--RenderFile \
perl-Mojolicious-Plugin-RenderFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Mojolicious"

inherit rpm
