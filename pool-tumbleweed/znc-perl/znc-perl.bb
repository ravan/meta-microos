SUMMARY = "Perl support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Perl extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "znc-perl-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "f37e8de080eab09e4f2c359d94aab373c7e8e0ea6d8ce98ced61fbf04e5001d939d41bcf83e197118cc9aa3e62a9cc3b46c5d01451a23e3189b0212e8272a257"

RPROVIDES:${PN} += "perl-ZNC \
perl-ZNC--BufLines \
perl-ZNC--CActionMessage \
perl-ZNC--CAuthBase \
perl-ZNC--CAuthenticateMessage \
perl-ZNC--CBufLine \
perl-ZNC--CBuffer \
perl-ZNC--CCTCPMessage \
perl-ZNC--CCapability \
perl-ZNC--CChan \
perl-ZNC--CChgHostMessage \
perl-ZNC--CClient \
perl-ZNC--CClientAuth \
perl-ZNC--CConfig \
perl-ZNC--CConfigEntry \
perl-ZNC--CCoreTranslationMixin \
perl-ZNC--CCron \
perl-ZNC--CDebug \
perl-ZNC--CDebugStream \
perl-ZNC--CDelayedTranslation \
perl-ZNC--CDir \
perl-ZNC--CException \
perl-ZNC--CExecSock \
perl-ZNC--CFPTimer \
perl-ZNC--CFile \
perl-ZNC--CGetAddrInfo \
perl-ZNC--CHTTPSock \
perl-ZNC--CIRCNetwork \
perl-ZNC--CIRCSock \
perl-ZNC--CIRCSocket \
perl-ZNC--CIncomingConnection \
perl-ZNC--CInviteMessage \
perl-ZNC--CJoinMessage \
perl-ZNC--CKickMessage \
perl-ZNC--CLanguageScope \
perl-ZNC--CListener \
perl-ZNC--CMessage \
perl-ZNC--CModCallProtector \
perl-ZNC--CModCommand \
perl-ZNC--CModInfo \
perl-ZNC--CModeMessage \
perl-ZNC--CModule \
perl-ZNC--CModuleEntry \
perl-ZNC--CModules \
perl-ZNC--CNick \
perl-ZNC--CNickMessage \
perl-ZNC--CNoticeMessage \
perl-ZNC--CNumericMessage \
perl-ZNC--COptionalTranslation \
perl-ZNC--CPartMessage \
perl-ZNC--CPerlCapability \
perl-ZNC--CPerlModule \
perl-ZNC--CPerlSocket \
perl-ZNC--CPerlTimer \
perl-ZNC--CQuitMessage \
perl-ZNC--CRealListener \
perl-ZNC--CSCharBuffer \
perl-ZNC--CSConnection \
perl-ZNC--CSListener \
perl-ZNC--CSMonitorFD \
perl-ZNC--CSSSLConnection \
perl-ZNC--CSSockAddr \
perl-ZNC--CServer \
perl-ZNC--CSockCommon \
perl-ZNC--CSockManager \
perl-ZNC--CSocket \
perl-ZNC--CSocketManager \
perl-ZNC--CTCPListener \
perl-ZNC--CTable \
perl-ZNC--CTargetMessage \
perl-ZNC--CTemplate \
perl-ZNC--CTemplateLoopContext \
perl-ZNC--CTemplateOptions \
perl-ZNC--CTemplateTagHandler \
perl-ZNC--CTextMessage \
perl-ZNC--CTimer \
perl-ZNC--CTopicMessage \
perl-ZNC--CTranslation \
perl-ZNC--CTranslationDomainRefHolder \
perl-ZNC--CTranslationInfo \
perl-ZNC--CUnixListener \
perl-ZNC--CUser \
perl-ZNC--CUtils \
perl-ZNC--CWebSession \
perl-ZNC--CWebSessionMap \
perl-ZNC--CWebSock \
perl-ZNC--CWebSubPage \
perl-ZNC--CZNC \
perl-ZNC--CZNCSock \
perl-ZNC--CZNCTagHandler \
perl-ZNC--Csock \
perl-ZNC--MCString \
perl-ZNC--PerlMCString \
perl-ZNC--SCString \
perl-ZNC--StrPair \
perl-ZNC--String \
perl-ZNC--VCString \
perl-ZNC--VChannels \
perl-ZNC--VIRCNetworks \
perl-ZNC--VListeners \
perl-ZNC--VPair \
perl-ZNC--VVString \
perl-ZNC--VWebSubPages \
perl-ZNC--ZNCSocketManager \
perl-ZNCc \
perl-perleval \
znc-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libperl.so \
libstdc++.so.6 \
perl \
znc"

inherit rpm
