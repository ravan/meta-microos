SUMMARY = "WebSocket protocol"
DESCRIPTION = "Client/server WebSocket message and frame parser/constructor. This module \
does not provide a WebSocket server or client, but is made for using in \
http servers or clients to provide WebSocket support. \
 \
Protocol::WebSocket supports the following WebSocket protocol versions: \
 \
    draft-ietf-hybi-17 (latest) \
    draft-ietf-hybi-10 \
    draft-ietf-hybi-00 (with HAProxy support) \
    draft-hixie-75 \
 \
By default the latest version is used. The WebSocket version is detected \
automatically on the server side. On the client side you have set a \
'version' attribute to an appropriate value. \
 \
Protocol::WebSocket itself does not contain any code and cannot be used \
directly. Instead the following modules should be used:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.260.0"

RPM_NAME = "perl-Protocol-WebSocket-0.260.0-1.7.noarch.rpm"
RPM_HASH = "e7ca2e78ee551f55bf0341817fbbba6c953475aa914e2519904d53ad19e63ba6d119257823361023b43378aa8dfd3b7808e0933c55b1589306cfe73af22b5cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Protocol--WebSocket \
perl-Protocol--WebSocket--Client \
perl-Protocol--WebSocket--Cookie \
perl-Protocol--WebSocket--Cookie--Request \
perl-Protocol--WebSocket--Cookie--Response \
perl-Protocol--WebSocket--Frame \
perl-Protocol--WebSocket--Handshake \
perl-Protocol--WebSocket--Handshake--Client \
perl-Protocol--WebSocket--Handshake--Server \
perl-Protocol--WebSocket--Message \
perl-Protocol--WebSocket--Request \
perl-Protocol--WebSocket--Response \
perl-Protocol--WebSocket--Stateful \
perl-Protocol--WebSocket--URL \
perl-Protocol-WebSocket"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Digest--SHA"

inherit rpm
