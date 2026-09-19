SUMMARY = "Personal Organizer"
DESCRIPTION = "KOrganizer is a calendar application by KDE."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "korganizer-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b6b78fd7006949a9407c96a872c6308f8c602551ca4a585fe4d8a90dab7ff9f407db7285ed9f1d6da27f3afd20f55f96eb86e77cea3da76296486bf17202a0a4"

RPROVIDES:${PN} += "korganizer \
korganizer5 \
libkorganizer-core.so.6 \
libkorganizer-interfaces.so.6 \
libkorganizerprivate.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-calendar-tools \
kalendarac \
kdepim-addons \
kdepim-runtime \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6Parts.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6CalendarSupport.so.6 \
libKPim6CalendarUtils.so.6 \
libKPim6EventViews.so.6 \
libKPim6IncidenceEditor.so.6 \
libKPim6KontactInterface.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6MailTransport.so.6 \
libKPim6PimCommon.so.6 \
libKPim6PimCommonActivities.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
