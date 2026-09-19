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

RPM_NAME = "python313-apprise-1.11.0-1.2.noarch.rpm"
RPM_HASH = "74f3ae104fc1df8695d639b279b020e9ea86ea9f9b4d84ee39e5b638f982e1954962d7e2de2af394b76446766d19a2c690c443290c13c2a0065f7350b412d7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apprise \
python3.13dist-apprise \
python313-apprise \
python3dist-apprise"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-Markdown \
python313-PyYAML \
python313-certifi \
python313-click \
python313-requests \
python313-requests-oauthlib"

inherit rpm
