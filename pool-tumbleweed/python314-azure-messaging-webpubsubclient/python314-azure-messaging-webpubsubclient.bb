SUMMARY = "Microsoft Azure Web PubSub Client Library for Python"
DESCRIPTION = "Azure Web PubSub is a cloud service that helps developers easily build real-time features \
in web applications with publish-subscribe patterns at scale. \
 \
Any scenario that requires real-time messaging between server and clients or among clients \
following publish-subscribe patterns can benefit from using Web PubSub. Developers no longer \
need to poll the server by sending repeated HTTP requests at intervals, which is wasteful \
and hard-to-scale. \
 \
As shown in the diagram below, your clients establish WebSocket connections with your Web \
PubSub resource. This client library: \
 \
 * simplifies managing client connections \
 * simplifies sending messages among clients \
 * automatically retries after unintended drops of client connection \
 * reliably deliveries messages in number and in order after recovering from connection drops"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-messaging-webpubsubclient-1.1.0-1.9.noarch.rpm"
RPM_HASH = "8e698c50eb0d6417ac1391fdd10a51947ea1a6f1d9fd68c7109891fc1fa1a90f2483199a0143f182075026436f37290fbbf5852a3d8f0c4a15be102a170bb649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-messaging-webpubsubclient \
python314-azure-messaging-webpubsubclient \
python3dist-azure-messaging-webpubsubclient"

RDEPENDS:${PN} += "-python314-azure-core >= 1.26.3 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
-python314-websocket-client >= 1.6.0 with python314-websocket-client < 2.0.0 \
python-abi \
python314-azure-messaging-nspkg \
python314-azure-nspkg"

inherit rpm
