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

RPM_NAME = "python314-azure-messaging-webpubsubservice-1.3.0-1.5.noarch.rpm"
RPM_HASH = "909303ce0d92fa9499ea5d4bb178a74acaf87b2c0f148641593bd290e04431f87cf8e87ffa9c6b6789a720d0c9ee7567348f033d0a8b9467b3545e467b37468c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-messaging-webpubsubservice \
python314-azure-messaging-webpubsubservice \
python3dist-azure-messaging-webpubsubservice"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
python-abi \
python314-PyJWT \
python314-azure-messaging-nspkg \
python314-azure-nspkg \
python314-isodate \
python314-typing-extensions"

inherit rpm
