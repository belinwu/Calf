package com.mohamedrejeb.calf.permissions.helper

import com.mohamedrejeb.calf.permissions.ExperimentalPermissionsApi
import com.mohamedrejeb.calf.permissions.PermissionStatus

internal interface PermissionDelegate {
    fun launchPermissionRequest(onPermissionResult: (Boolean) -> Unit)

    @OptIn(ExperimentalPermissionsApi::class)
    fun getPermissionStatus(): PermissionStatus
}