SUMMARY = "Add a websocket interface to your Dancers app"
DESCRIPTION = "'Dancer2::Plugin::WebSocket' provides an interface to Plack::App::WebSocket \
and allows to interact with the webSocket connections within the Dancer \
app. \
 \
Plack::App::WebSocket, and thus this plugin, requires a plack server that \
supports the psgi _streaming_, _nonblocking_ and _io_. Twiggy is the most \
popular server fitting the bill."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.1"

RPM_NAME = "perl-Dancer2-Plugin-WebSocket-0.3.1-1.25.noarch.rpm"
RPM_HASH = "2b469c71b0329d0af5a87ef981397a64c53d84003dda5e64843aaf558d3fcaffed66a8572d181544d211b46ebc6a8950046d75796b089b9d98cd6eec936f0db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--WebSocket \
perl-Dancer2--Plugin--WebSocket--Connection \
perl-Dancer2--Plugin--WebSocket--Group \
perl-Dancer2-Plugin-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Dancer2--Plugin \
perl-JSON--MaybeXS \
perl-Moo \
perl-Moo--Role \
perl-Plack--App--WebSocket \
perl-Set--Tiny \
perl-Try--Tiny"

inherit rpm
