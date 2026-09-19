SUMMARY = "A simple wrapper to many popular notification services used today"
DESCRIPTION = "Apprise is a Python package for simplifying access to all of the different \
notification services that are out there. Apprise opens the door and makes \
it easy to access: \
 \
Apprise API, APRS, AWS SES, AWS SNS, Bark, Boxcar, Burst SMS, BulkSMS, BulkVS, \
ClickSend, DAPNET, DingTalk, Discord, E-Mail, Emby, Faast, FCM, Flock, \
Google Chat, Gotify, Growl, Guilded, Home Assistant, httpSMS, IFTTT, Join, \
Kavenegar, KODI, Kumulos, LaMetric, Line, MacOSX, Mailgun, Mastodon, \
Mattermost,Matrix, MessageBird, Microsoft Windows, Microsoft Teams, Misskey, \
MQTT, MSG91, MyAndroid, Nexmo, Nextcloud, NextcloudTalk, Notica, Notifiarr, \
Notifico, ntfy, Office365, OneSignal, Opsgenie, PagerDuty, PagerTree, \
ParsePlatform, PopcornNotify, Prowl, Pushalot, PushBullet, Pushjet, PushMe, \
Pushover, PushSafer, Pushy, PushDeer, Reddit, Rocket.Chat, RSyslog, SendGrid, \
ServerChan, Signal, SimplePush, Sinch, Slack, SMSEagle, SMS Manager, SMTP2Go, \
SparkPost, Super Toasty, Streamlabs, Stride, Synology Chat, Syslog, \
Techulus Push, Telegram, Threema Gateway, Twilio, Twitter, Twist, XBMC, \
Voipms, Vonage, WeCom Bot, WhatsApp, Webex Teams."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "python314-apprise-1.11.0-1.2.noarch.rpm"
RPM_HASH = "6d5d263340cbb722cc95c1a6b51d266b1b0e1efa9efe2b3d9f9e8aee4bd1e9dfdd3f81cef8d2d2ffa17cc1e758d5f115e56c799767123f0ea21ca9f360a60d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apprise \
python314-apprise \
python3dist-apprise"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-Markdown \
python314-PyYAML \
python314-certifi \
python314-click \
python314-requests \
python314-requests-oauthlib"

inherit rpm
