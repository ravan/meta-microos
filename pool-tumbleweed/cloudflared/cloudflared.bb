SUMMARY = "Cloudflare Tunnel client"
DESCRIPTION = "Contains the command-line client for Cloudflare Tunnel, a tunneling daemon that \
proxies traffic from the Cloudflare network to your origins. This daemon sits \
between Cloudflare network and your origin (e.g. a webserver). Cloudflare \
attracts client requests and sends them to you via this daemon, without \
requiring you to poke holes on your firewall --- your origin can remain as \
closed as possible. Extensive documentation can be found in the Cloudflare \
Tunnel section of the Cloudflare Docs. All usages related with proxying to your \
origins are available under cloudflared tunnel help."
LICENSE = "Apache-2.0"

PV = "2026.8.2"

RPM_NAME = "cloudflared-2026.8.2-1.1.aarch64.rpm"
RPM_HASH = "dc2ad45705011665bc03a6617416a37d9826aadcbd7a04541af93a5db0efedb90c0e3f3bfe52ff8b74f26bd60216409527659846783e681af83ea67f7d5ec2fb"

RPROVIDES:${PN} += "cloudflared"

RDEPENDS:${PN} += ""

inherit rpm
