SUMMARY = "Microsoft Azure WebPubSub Service Client Library for Python"
DESCRIPTION = "Azure Web PubSub Service is a service that enables you to build real-time messaging web applications \
using WebSockets and the publish-subscribe pattern. Any platform supporting WebSocket APIs can connect \
to the service easily, e.g. web pages, mobile applications, edge devices, etc. The service manages the \
WebSocket connections for you and allows up to 100K concurrent connections. It provides powerful APIs \
for you to manage these clients and deliver real-time messages. \
 \
Any scenario that requires real-time publish-subscribe messaging between server and clients or among \
clients, can use Azure Web PubSub service. Traditional real-time features that often require polling \
from server or submitting HTTP requests, can also use Azure Web PubSub service. \
 \
We list some examples that are good to use Azure Web PubSub service: \
 \
 * High frequency data updates: gaming, voting, polling, auction. \
 * Live dashboards and monitoring: company dashboard, financial market data, instant sales update, \
   multi-player game leader board, and IoT monitoring. \
 * Cross-platform live chat: live chat room, chat bot, on-line customer support, real-time shopping \
   assistant, messenger, in-game chat, and so on. \
 * Real-time location on map: logistic tracking, delivery status tracking, transportation status \
   updates, GPS apps. \
 * Real-time targeted ads: personalized real-time push ads and offers, interactive ads. \
 * Collaborative apps: coauthoring, whiteboard apps and team meeting software. \
 * Push instant notifications: social network, email, game, travel alert. \
 * Real-time broadcasting: live audio/video broadcasting, live captioning, translating, \
   events/news broadcasting. \
 * IoT and connected devices: real-time IoT metrics, remote control, real-time status, \
   and location tracking. \
 * Automation: real-time trigger from upstream events. \
 \
Use the client library to: \
 \
 * Send messages to hubs and groups. \
 * Send messages to particular users and connections. \
 * Organize users and connections into groups. \
 * Close connections \
 * Grant/revoke/check permissions for an existing connection"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-azure-messaging-webpubsubservice-1.3.0-1.5.noarch.rpm"
RPM_HASH = "1048afe260a35a41025cf941b60099adb61944824946944076fd6dae39ad3dda91f3b903859b864b0174fa5ddabf3aa778e3f82556faeaa168756e824859416a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-messaging-webpubsubservice \
python3.13dist-azure-messaging-webpubsubservice \
python313-azure-messaging-webpubsubservice \
python3dist-azure-messaging-webpubsubservice"

RDEPENDS:${PN} += "-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
python-abi \
python313-PyJWT \
python313-azure-messaging-nspkg \
python313-azure-nspkg \
python313-isodate \
python313-typing-extensions"

inherit rpm
