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

RPM_NAME = "python313-azure-messaging-webpubsubclient-1.1.0-1.9.noarch.rpm"
RPM_HASH = "0231376edeeb024e09beb1f97c50255f50b5707e97a6b743abaa84c3c7ece3e8af2eb132bccb31d70068dfb7490bf449217f13b2eb38b7ec25697a7080e69785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-messaging-webpubsubclient \
python3.13dist-azure-messaging-webpubsubclient \
python313-azure-messaging-webpubsubclient \
python3dist-azure-messaging-webpubsubclient"

RDEPENDS:${PN} += "-python313-azure-core >= 1.26.3 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
-python313-websocket-client >= 1.6.0 with python313-websocket-client < 2.0.0 \
python-abi \
python313-azure-messaging-nspkg \
python313-azure-nspkg"

inherit rpm
