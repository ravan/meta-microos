SUMMARY = "Connect Perl with AI using MCP (Model Context Protocol)"
DESCRIPTION = "Connect Perl with AI using the Model Context Protocol (MCP). An MCP server \
hands a model three kinds of things: tools it can call, prompts it can \
start from, and resources it can read. At its core MCP is all about text \
processing, which makes it a great fit for Perl. \
 \
The protocol revision implemented is '2026-07-28', and it is stateless. \
There is no handshake and no session, every request stands on its own, so \
an MCP endpoint is just another route in your Mojolicious application and \
scales the same way. \
 \
Read on for a tour, or go straight to MCP::Server for the reference \
documentation."
LICENSE = "MIT"

PV = "0.150.0"

RPM_NAME = "perl-MCP-0.150.0-1.1.noarch.rpm"
RPM_HASH = "51d16a2744310ffeb2a7b34633bf351cda59ddf8aa085839550de59ee0590ec9b4cebd043c7d6fa9bf63e63eb1f49c8438ca7d7655cf86b7791c9eda27e94e2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MCP \
perl-MCP--Client \
perl-MCP--Constants \
perl-MCP--Primitive \
perl-MCP--Prompt \
perl-MCP--Resource \
perl-MCP--Server \
perl-MCP--Server--Context \
perl-MCP--Server--Legacy \
perl-MCP--Server--Subscription \
perl-MCP--Server--Transport \
perl-MCP--Server--Transport--HTTP \
perl-MCP--Server--Transport--Stdio \
perl-MCP--Tool"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-CryptX \
perl-IPC--Run \
perl-JSON--Schema--Tiny \
perl-Mojolicious"

inherit rpm
